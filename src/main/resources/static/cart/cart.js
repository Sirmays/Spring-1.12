angular.module('market-front').controller('cartController', function ($scope, $http, $location) {
    const contextPath = 'http://localhost:8189/market/api/v1';

    $scope.loadProducts = function () {
        $http.get(contextPath +'/cart')
        .then(function (response) {
            console.log(response);
            $scope.productsInCartPage = response.data;
              });
    }


     $scope.deleteProduct=function(product){
         $http.get(contextPath + '/cart/delete/'+product.id)
         .then(function (response) {
            $scope.loadProducts();
              });
    }

    $scope.loadProducts();


});