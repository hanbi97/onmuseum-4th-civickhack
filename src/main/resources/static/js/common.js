
function redirectDetail(id){
    location.href=`/exhibitions/${id}`;
}

function redirectTo(url){
    location.href=`http://localhost:8080/${url}`;
}

function success(){
    alert('소중한 의견 감사합니다!');
    location.href=`http://localhost:8080`;
}