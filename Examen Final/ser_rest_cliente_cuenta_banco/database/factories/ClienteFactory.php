<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Cliente>
 */
class ClienteFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition()
    {
        return [
            'nrodocumento'=> 1,
            'complemento'=> "desconocido",
            'nombres'=>fake()->name(),
            'primerapellido'=>fake()->lastName(),
            'segundoapellido'=>fake()->lastName(),
        ];
    }
}
