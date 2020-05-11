

$(document).ready(function () {

    $.ajax({
        type: "GET",
        url: "/getAll",
        // The key needs to match your method's input parameter (case-sensitive).
        data: null,
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function(dataX){

            $('#list_id').empty()

            for (let i = 0; i < dataX.length; i++) {
                let e = dataX[i];
                let ne = $("<li class='list' onclick='elementClick(event)'>" + e.id + "</li>")
                ne.data("val", JSON.stringify(e, null , 2))
                $( "#list_id" ).append(ne)
            }
            $('#historyOut_id').val();
        },
        failure: function(errMsg) {
            alert(errMsg);
        }
    });
});

function elementClick(th) {
    let li = th.currentTarget
    let f = $(li).data("val")
    $('#historyOut_id').val(f);
}

