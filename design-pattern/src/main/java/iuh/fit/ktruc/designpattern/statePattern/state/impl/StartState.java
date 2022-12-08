package iuh.fit.ktruc.designpattern.statePattern.state.impl;

import iuh.fit.ktruc.designpattern.statePattern.state.Context;
import iuh.fit.ktruc.designpattern.statePattern.state.State;
/**
 * Tạo các lớp cụ thể thực hiện cùng một giao diện.
 * @author Admin
 *
 */
public class StartState implements State {

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in start state --- " + this);
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}

}
