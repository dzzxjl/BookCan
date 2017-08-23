var app = angular.module('myApp', []);
    
app.controller('siteCtrl', function($scope, $http) {

    btnsignin.onclick = function() {

        var email = formlogin.email.value;
        var password = formlogin.password.value;
        $http({
            method: 'POST',
            url: 'http://localhost:8080/user/login?' + 'email=' + email +'&password=' + password,

        }).then(function successCallback(response) {
            // console.log(data.username);
            console.log(response);
            $scope.user = response.data;
            user = response.data;

            console.log(user.username);
            // console.log(typeof());
                if(!(response.data)==''){
                $http({
                    method: 'GET',
                    url: 'http://localhost:8080/bookcan'
                }).then(function successCallback(response) {
                        $scope.books = response.data;
                        // 定义全局变量books
                        books = response.data;
                        
                        console.log($scope.books)
                    }, function errorCallback(response) {
                        // 请求失败执行代码
                });
                $http({
                    method: 'GET',
                    url: 'http://localhost:8080/bookcancount'
                }).then(function successCallback(response) {
                        $scope.count = response.data;
                    }, function errorCallback(response) {
                        // 请求失败执行代码
                });
                $("#login").hide();
                $("#main").show();
                document.getElementById('show').innerHTML='已登录';
                } else {
                    alert("密码错误，请重新输入");
                }

            }, function errorCallback(response) {
                // 请求失败执行代码
        });


        
    }
        
    var btn = document.getElementById('btn');
    
    /*
    添加图书
    */
    btn.onclick = function() {

      var name = myform.name.value;
      var tag = myform.tag.value;
      var status = myform.inlineRadioOptions.value;
      
      if (name == null || name == "") {
         alert("需要输入书名");
         return false;
      } else if (status == null || status == "") {
         alert("需要输入状态");
         return false;
      }     
        $http({
          method: 'GET',
          url: 'http://localhost:8080/addbook?name=' + name + '&status=' + status + '&tag=' + tag
        }).then(function successCallback(response) {
                var data = response.data;
                console.log(data);
                if(!data){
                    alert("此书数据库已存在");        
                } else {
                    $scope.books = data;
                    document.getElementById("liid1").className="";
                    document.getElementById("liid2").className="";
                    document.getElementById("liid3").className="";
                }
            }, function errorCallback(response) {
                // 请求失败执行代码
        });
    };

    btn1.onclick = function() {
      // app.controller('siteCtrl', function($scope, $http) {
        $http({
          method: 'GET',
          url: 'http://localhost:8080/book?status=0' 
        }).then(function successCallback(response) {
          document.getElementById("liid1").className="active";
          document.getElementById("liid2").className="";
          document.getElementById("liid3").className="";
                $scope.books = response.data;
                // alert(book.bid + " " + book.name);
            }, function errorCallback(response) {
                // 请求失败执行代码
        });
      // });
    };
    btn2.onclick = function() {
        // window.book='hha';
        // document.getElementById('book').ng-repeat =  'x in books | filter: {status: 1}';
        $http({
          method: 'GET',
          url: 'http://localhost:8080/book?status=1' 
        }).then(function successCallback(response) {
          document.getElementById("liid1").className="";
          document.getElementById("liid2").className="active";
          document.getElementById("liid3").className="";
                $scope.books = response.data;
                // alert(book.bid + " " + book.name);
            }, function errorCallback(response) {
                // 请求失败执行代码
        });
        // console.log(data)
    };
    btn3.onclick = function() {
        $http({
          method: 'GET',
          url: 'http://localhost:8080/book?status=2' 
        }).then(function successCallback(response) {
                $scope.books = response.data;
                document.getElementById("liid1").className="";
                document.getElementById("liid2").className="";
                document.getElementById("liid3").className="active";
            }, function errorCallback(response) {
                // 请求失败执行代码
        });
    };

    function shanchu(id) {
        $http({
          method: 'get',
          url: "http://localhost:8080/deletebook?id=" + id
        }).then(function successCallback(response) {
          $scope.books = response.data;
        });
    }
    window.shanchu = shanchu;

});

function validateForm() {
    var x = document.forms["myForm"]["fname"].value;
    if (x == null || x == "") {
        alert("需要输入名字。");
        return false;
    }
}

function tiaozhuan(id) {
  console.log(id);
  var url = './book.html?id=' + id;
  window.open(url)
  // window.open("baidu.com");
};

// function shanchu(id) {

// }





