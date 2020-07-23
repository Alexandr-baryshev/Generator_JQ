

$(document).ready(function () {

    $.ajax({
        type: "GET",
        url: "/getAll",
        data: null,
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function(dataX){

            for (let i = 0; i < dataX.length; i++) {
                let allJson = dataX[i];
                let newLi = $("<li class='list' onclick='elementClick(event)'>" + allJson.id + "</li>")
                newLi.data("vaL", JSON.stringify(allJson, null , 2))
                $( "#list_id" ).append(newLi)
            }
            // $('#historyOut_id').val();
        },
        failure: function(errMsg) {
            alert(errMsg);
        }
    });
});

function elementClick(cl) {
    let liHead = cl.currentTarget
    let ilContent = $(liHead).data("vaL")
    $('#historyOut_id').val(ilContent);
}

