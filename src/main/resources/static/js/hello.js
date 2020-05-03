// ********** JQuery - Ajax  ************************

$(document).ready(function () {
    $('#butt_id').on('click', function () {
        $.ajax({
            url: 'GeneratorData.java'
        });
        // alert('РАБОТАТЕТ')

        let gdJs = {
            inputTxt: null,
            startR: null,
            sizeR: null,
            startC: null,
            sizeC: null
        };

        gdJs.inputTxt = $('#inputTxt_id').val()
        gdJs.startR = $('#startR_id').val()
        gdJs.sizeR = $('#sizeR_id').val()
        gdJs.startC = $('#startC_id').val()
        gdJs.sizeC = $('#sizeC_id').val()

        $('#outTxt_id').val(gdJs)

     // ...... связь потеряна...

    });
});


// ****** Просто JQuery - все ОК, если запускать через значек браузера в HTML файле ******

// $('document').ready(function () {
//     $('#butt_id').on('click', function () {
//         // alert('РАБОТАТЕТ');
//
//         var inputTxt, startR, sizeR, startC, sizeC
//
//         inputTxt = $('#inputTxt_id').val()
//
//         startR = $('#startR_id').val()
//         startR = parseInt(startR)
//
//         sizeR = $('#sizeR_id').val()
//         sizeR = parseInt(sizeR)
//
//         startC = $('#startC_id').val()
//         startC = parseInt(startC)
//
//         sizeC = $('#sizeC_id').val()
//         sizeC = parseInt(sizeC)
//
//         $('#outTxt_id').val(sort_R(inputTxt, startR, sizeR, startC, sizeC))
//     });
// });
//
//
// function sort_R(inputTxtp, startRp, sizeRp, startCp, sizeCp) { //
//     let row, column, allResult = ""
//
//     for (let r = startRp; r <= sizeRp; r++) {
//         row = inputTxtp.replace("R1", "R" + r)
//
//         for (let c = startCp; c <= sizeCp; c += 1) {
//             column = row.replace("C1", "C" + c);
//             allResult = allResult + column + "\n";
//         }
//     }
//     return (allResult)
// }