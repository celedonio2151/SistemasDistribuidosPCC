<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class CuentaBanco extends Model
{
    use HasFactory;
    protected $fillable = [
        'nrocuenta',
        'cliente',
        'saldo',
    ];
}
