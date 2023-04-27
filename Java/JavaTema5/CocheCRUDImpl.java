package com.tema5;
public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Método save() desde Interface");
    }
    @Override
    public void findAll() {
        System.out.println("Método findAll() desde Interface");
    }
    @Override
    public void delete() {
        System.out.println("Método delete() desde Interface");
    }
}
