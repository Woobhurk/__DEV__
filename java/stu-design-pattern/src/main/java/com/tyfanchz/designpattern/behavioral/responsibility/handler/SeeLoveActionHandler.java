package com.tyfanchz.designpattern.behavioral.responsibility.handler;

import com.tyfanchz.designpattern.behavioral.responsibility.action.LoveAction;
import com.tyfanchz.designpattern.behavioral.responsibility.love.Love;

/**
 * <p>Description:
 *
 * <p>Project: DesignPattern
 *
 * @author tyfanchz
 * @date 2020-04-07
 */
public class SeeLoveActionHandler implements LoveActionHandler {
    @Override
    public boolean proceed(Love love) {
        love.wellIWantToDo();
        System.out.println("看到小甜心了...");

        return false;
    }

    @Override
    public LoveAction getLoveAction() {
        return LoveAction.SEE;
    }
}
