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
            //console.log(resp);
            if(resp.data===1) {
                alert("입차되었습니다.");
                location.href = "/welcome";
            }
            else if(resp.data===-2){
                alert("이미 입차된 차량입니다!");
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