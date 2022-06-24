<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
// use App\Models\Cliente;
use App\Http\Controllers\ClienteController;
use App\Http\Controllers\TipoCuentaController;

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

// Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
//     return $request->user();
// });

Route::get('clientes', [ClienteController::class, 'index']);
Route::get('clientes/{id}',[ClienteController::class, 'show']);
Route::post('clientes', [ClienteController::class, 'store']);
Route::put('clientes/{id}', [ClienteController::class, 'update']);
Route::patch('clientes/{id}', [ClienteController::class, 'update']);
Route::delete('clientes/{id}', [ClienteController::class, 'destroy']);


// Rutas para Controller TipoCuenta
Route::get('cuentas', [TipoCuentaController::class, 'index']);
Route::get('cuentas/{id}', [TipoCuentaController::class, 'show']);
Route::post('cuentas', [TipoCuentaController::class, 'store']);
Route::put('cuentas/{id}', [TipoCuentaController::class, 'update']);
Route::patch('cuentas/{id}', [TipoCuentaController::class, 'update']);
Route::delete('cuentas/{id}', [TipoCuentaController::class, 'destroy']);


