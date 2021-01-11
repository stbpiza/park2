let index = {
    init: function(){
        $("#start").on("click", ()=>{
            this.start();
        });
    },
    start: function (){
        let data = { dum : 1 }

        $.ajax({
            type: "POST",
            url: "/api/start",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function(resp){
            //console.log(resp);
            if(resp===1) {
                alert("서비스를 시작합니다.");
                location.href = "/gate";
            }
            else{
                alert("에러가 발생하였습니다. 관리자를 호출해주세요");
            }
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    }
}

index.init();

