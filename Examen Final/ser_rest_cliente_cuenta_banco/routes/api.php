<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\ClienteController;
use App\Http\Controllers\CuentaController;
use App\Http\Controllers\UserController;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
    return $request->user();
});


Route::get('/cliente', [ClienteController::class,'index']);
Route::get('/cliente/{id}', [ClienteController::class,'show']);
Route::post('/cliente', [ClienteController::class,'store']);
Route::put('/cliente/{id}', [ClienteController::class,'update']);
Route::delete('/cliente/{id}', [ClienteController::class,'destroy']);



Route::get('/cuentas', [CuentaController::class,'index']);
Route::get('/cuentas/{id}', [CuentaController::class,'show']);
Route::post('/cuentas', [CuentaController::class,'store']);
Route::put('cuentas/{id}', [CuentaController::class, 'update']);
Route::delete('cuentas/{id}', [CuentaController::class, 'destroy']);
