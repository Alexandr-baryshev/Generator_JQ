
$(document).ready(function (){

   $('#butt_id').on('click', function () {

      $.ajax({
         type: "POST",
         url: "/data",
         data: JSON.stringify(gData(), null, 2),
         contentType: "application/json; charset=utf-8",
         dataType: "json",
         success: function (dataX) {
            // let result = dataX.outTxt;
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
            // let result = dataX.outTxt;
            $('#outTxt_id').val(dataX.outTxt);
         },
         failure: function (errMsg) {
            alert(errMsg);
         }
      });
   });
});


function gData() {
   // Создание "data класса"
   let gd = {
      inputTxt: null,
      outTxt: null,

      startR: null,
      sizeR: null,
      stepR: null,
      targetR: null,
      replaceR: null,

      startC: null,
      sizeC: null,
      stepC: null,
      targetC: null,
      replaceC: null,

      positX: null,
      positY: null,
      width: null,
      height: null
   };

   //Присваивание значений RC
   {
      gd.inputTxt = $('#inputTxt_id').val()
      if (gd.inputTxt === "") {
         gd.inputTxt = "R1 C1"
      }

      gd.outTxt = $('#outTxt_id').val()


      gd.startR = $('#startR_id').val()
      if (gd.startR === "") {
         gd.startR = 1
      }

      gd.sizeR = $('#sizeR_id').val()
      if (gd.sizeR === "") {
         gd.sizeR = 1
      }

      gd.stepR = $('#stepR_id').val()
      if (gd.stepR === "") {
         gd.stepR = 1
      }

      gd.targetR = $('#targetR_id').val()
      if (gd.targetR === "") {
         gd.targetR = "R1"
      }

      gd.replaceR = $('#replaceR_id').val()
      if (gd.replaceR === "") {
         gd.replaceR = "R"
      }


      gd.startC = $('#startC_id').val()
      if (gd.startC === "") {
         gd.startC = 1
      }

      gd.sizeC = $('#sizeC_id').val()
      if (gd.sizeC === "") {
         gd.sizeC = 1
      }

      gd.stepC = $('#stepC_id').val()
      if (gd.stepC === "") {
         gd.stepC = 1
      }

      gd.targetC = $('#targetC_id').val()
      if (gd.targetC === "") {
         gd.targetC = "C1"
      }

      gd.replaceC = $('#replaceC_id').val()
      if (gd.replaceC === "") {
         gd.replaceC = "C"
      }

      gd.positX = $('#positX_id').val()
      gd.positY = $('#positY_id').val()
      gd.width = $('#width_id').val()
      gd.height = $('#height_id').val()

      return gd
   }
}

