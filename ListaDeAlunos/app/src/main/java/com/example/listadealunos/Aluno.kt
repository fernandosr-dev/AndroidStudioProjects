package com.example.listadealunos

class Aluno (val nome: String, val morada: String, val email: String) {

    override fun toString(): String {
        return "$nome"
    }
}