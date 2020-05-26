
$(document).ready(function (){

   $('#butt_id').on('click', function () {

      $.ajax({
         type: "POST",
         url: "/data",
         data: JSON.stringify(gData(), null, 2),
         contentType: "application/json; charset=utf-8",
         dataType: "json",
         success: function (dataX) {

            $('#outTxt_id').val(dataX.outTxt);
         },
         failure: function (errMsg) {
            alert(errMsg);
         }
      });
   });


   $('#buttSave_id').on('click', function () {

      $.ajax({
         type: "POST",
         url: "/dataSave",
         data: JSON.stringify(gData(), null, 2),
         contentType: "application/json; charset=utf-8",
         dataType: "json",
         success: function (dataX) {

            $('#outTxt_id').val(dataX.outTxt);
         },
         failure: function (errMsg) {
            alert(errMsg);
         }
      });
   });
});

