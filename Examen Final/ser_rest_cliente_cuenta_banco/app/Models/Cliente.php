<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Cliente extends Model
{
    use HasFactory;
    protected $fillable = [
        'nrodocumento',
        'complemento',
        'nombres',
        'primerapellido',
        'segundoapellido',
    ];
}
