$(document).ready(function () {
    $("#form").validate({
        rules: {
            name: {
                required: true,
                maxlength: 60,
                nameValidator: true
            },
            surname: {
                required: true,
                maxlength: 60,
                nameValidator: true
            },
            bornDate: {
                required: true,
                dateValidator: true,
            },
            gender: "required"

        },
        messages: {
            name: {
                required: "Please enter name.",
                maxlength: " 0 - 60 leters."
            },
            surname: {
                required: "Please enter surname.",
                maxlength: " 0 - 60 leters."
            },
            bornDate: {
                required: "Please enter born date (dd/MM/yyyy).",
                date: "Please enter born date (dd/MM/yyyy)."
            },
            gender: "Please select Male or Female."
        },
        errorPlacement: function (error, element) {
            if (element.is(":radio")) {
                error.appendTo(element.parents('.gender'));
            }
            else {
                error.insertAfter(element);
            }
        }
    });
    
    $.validator.addMethod("nameValidator", function (value, element) {
        return /^[A-Za-z_ -]+$/.test(value);
    }, "Alpha Characters Only.");
    
    $.validator.addMethod("dateValidator", function (value, element) {
        return isDate(value);
    }, "Please enter date from past(dd/MM/yyyy).");

    //Date picker
    $(function () {
        $("#datepicker").datepicker({
            maxDate: "0d 0m 0w",
            dateFormat: "dd/mm/yy"

        });
    });
    
    //Valide if is date from past
    function isPastDate(txtDate){
		 
        var dt1   = parseInt(txtDate.substring(0,2));
        var mon1  = parseInt(txtDate.substring(3,5));
        var yr1   = parseInt(txtDate.substring(6,10));
        var selectedDate = new Date(yr1, mon1-1, dt1);
        var now = new Date();
        
        if(now < selectedDate){
            return false;
        }
        return true;
     }

	//Valide correct format of date
    function isDate(txtDate)
    {  
        var currVal = txtDate
        if (currVal == '')
            return false;
            
        var rxDatePattern = /^(\d{1,2})(\/|-)(\d{1,2})(\/|-)(\d{4})$/;
        var dtArray = currVal.match(rxDatePattern);

        if (dtArray == null)
            return false;

        dtDay = dtArray[1];
        dtMonth = dtArray[3];
        dtYear = dtArray[5];

        if (dtMonth < 1 || dtMonth > 12)
            return false;

        else if (dtDay < 1 || dtDay > 31)
            return false;

        else if ((dtMonth == 4 || dtMonth == 6 || dtMonth == 9 || dtMonth == 11) && dtDay == 31)
            return false;

        else if (dtMonth == 2) {
            var isleap = (dtYear % 4 == 0 && (dtYear % 100 != 0 || dtYear % 400 == 0));

            if (dtDay > 29 || (dtDay == 29 && !isleap))
                return false;
		}

        return isPastDate(txtDate);
    }


});

