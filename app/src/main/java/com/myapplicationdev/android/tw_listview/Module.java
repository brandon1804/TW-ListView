package com.myapplicationdev.android.tw_listview;

public class Module {

    private String module;
    private boolean prog;

    public Module(String Module, boolean prog) {
        this.module = Module;
        this.prog = prog;
    }

    public String getModule() {
        return module;
    }

    public boolean isProg() {
        return prog;
    }
}//end of class
