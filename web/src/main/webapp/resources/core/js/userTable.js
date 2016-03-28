$.extend($.fn.dataTable.defaults, {
    searching: false,
});

$(document).ready(function () {
    $.ajax({
            url: "/userCrud",
            type: "GET",
            contentType: "application/json",
            data: "{\"name\":\"The name\",\"desc\":\"The description\"}"
//                        success: function(data, status){
//                            alert("Data: " + data + "\nStatus: " + status);
//                        }
        })
        .done(function (data, textStatus, jqXHR) {
            for (var i = 0; i < data.length; i++) {
                drawRow(data[i]);
            }
            // alert("Success: " + data.tr);
        })
        .fail(function (jqXHR, textStatus, errorThrown) {
            alert("Error " + textStatus + " " + errorThrown);
        })
        .always(function (jqXHROrData, textStatus, jqXHROrErrorThrown) {
            // alert("complete  " + textStatus);
            var table = $('#userTable').dataTable({
                "lengthMenu": [10, 30, 50]
            });
            $('#userTable tbody').on('click', 'tr', function () {
                if ($(this).hasClass('selected')) {
                    $(this).removeClass('selected');
                } else {
                    table.$('tr.selected').removeClass('selected');
                    $(this).addClass('selected');
                }
            });
        });


});

function drawRow(rowData) {
    var row = $("<tr />")
    $("#userTable").append(row);
    row.append($("<td>" + rowData.name + "</td>"));
    row.append($("<td>" + rowData.position + "</td>"));
    row.append($("<td>" + rowData.office + "</td>"));
    row.append($("<td>" + rowData.age + "</td>"));
    row.append($("<td>" + rowData.startDate + "</td>"));
    row.append($("<td>" + rowData.salary + "</td>"));
};