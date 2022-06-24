<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

class TipoCuentaFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array
     */
    public function definition()
    {
        $numero = 200.05;
        return [
            'nombre' => $this->faker->name(),
            'interes' => $numero,
        ];
    }
}
