<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('cuenta_bancos', function (Blueprint $table) {
            $table->engine = 'InnoDB';
            $table->id();
            $table->bigInteger("nrocuenta");
            $table->BigInteger("cliente");
            $table->Double("saldo",20);

            // $table->bigInteger('cliente_id')->unsigned();
            // $table->foreign('cliente_id')->references('id')->on('clientes');

        //     $table->foreign("cliente_id")
        // ->references("id")
        // ->on("clientes")
        // ->onDelete("cascade")
        // ->onUpdate("cascade");

            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('cuenta_bancos');
    }
};
