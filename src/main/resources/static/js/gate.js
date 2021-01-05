let index = {
    init: function(){
        $("#incar").on("click", ()=>{
            this.save();
        });
    },
    save: function (){
        let data = {
            car_num: $("#car_num").val()
        }

        $.ajax({
            type: "POST",
            url: "/api/in",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function(resp){
            alert("입차되었습니다.");
            location.href="/welcome";
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    }
}

index.init();