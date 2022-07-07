(function () {
    angular
        .module('market-front', ['ngRoute','ngStorage'])
        .config(config)
        .run(run);

    function config($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'welcome/welcome.html',
                controller: 'welcomeController'
            })
            .when('/store', {
                templateUrl: 'store/store.html',
                controller: 'storeController'
            })
            .when('/edit_product/:productId', {
                templateUrl: 'edit_product/edit_product.html',
                controller: 'editProductController'
            })
            .when('/create_product', {
                templateUrl: 'create_product/create_product.html',
                controller: 'createProductController'
            })
             .when('/cart', {
                 templateUrl: 'cart/cart.html',
                  controller: 'cartController'
             })
             .when('/login', {
                   templateUrl: 'login/login.html',
                   controller: 'loginController'
             })
            .otherwise({
                redirectTo: '/'
            });
    }

    function run($rootScope, $http, $localStorage) {
           if ($localStorage.webMarketUser) {
                $http.defaults.headers.common.Authorization = 'Bearer ' + $localStorage.webMarketUser.token;
            }
    }
})();

angular.module('market-front').controller('indexController', function ($rootScope, $scope, $http, $localStorage) {
    const contextPath = 'http://localhost:8189/market/api/v1';

});