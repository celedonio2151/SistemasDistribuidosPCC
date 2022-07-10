<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Persona>
 */
class PersonaFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition()
    {
        $sexos = ["M","F"];
        $aleatorio = rand(0,1);
        return [
            'nombres' => $this->faker->name(),
            'apellidos' => $this->faker->lastName(),
            'sexo' => $this->faker->randomElement(['M', 'F']),
            'estatura' => rand(150,220),
        ];
    }
}
