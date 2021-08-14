package com.play.game.service.impl;

import com.play.game.service.State;

public class StateImpl implements State {
    @Override
    public void updateState(){
        System.out.println("==> State Updated!!");
    }
}
