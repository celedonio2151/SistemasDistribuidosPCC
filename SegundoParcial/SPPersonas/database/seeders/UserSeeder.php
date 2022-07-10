<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use App\Models\User;
use Illuminate\Support\Facades\Hash;
use Illuminate\Support\Str;

class UserSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        User::factory(1)->create();
        User::Create([
            'name' => 'carlos montellano',
            'email' => 'admin',
            'email_verified_at' => now(),
            'password' =>Hash::make('456'), 
            'nivel' => 'admin',
            'remember_token' => Str::random(10)
        ]);
        User::Create([
            'name' => 'carlos montellano',
            'email' => 'usuario',
            'email_verified_at' => now(),
            'password' =>Hash::make('123'), 
            'nivel' => 'usuario',
            'remember_token' => Str::random(10)
        ]);
    }
}
