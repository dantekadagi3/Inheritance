package com.example.inheritance

class Offspring: Secondary(),Archery,Singer {
    override fun archery() {
        super.archery()
        println()
    }
}