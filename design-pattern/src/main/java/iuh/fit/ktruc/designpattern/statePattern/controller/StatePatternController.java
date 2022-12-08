package iuh.fit.ktruc.designpattern.statePattern.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.fit.ktruc.designpattern.statePattern.state.Context;
import iuh.fit.ktruc.designpattern.statePattern.state.impl.StartState;
import iuh.fit.ktruc.designpattern.statePattern.state.impl.StopState;

/**
 * Use the Context to see change in behaviour when State changes. Sử dụng Bối
 * cảnh để xem thay đổi trong hành vi khi Trạng thái thay đổi.
 * 
 * @author Admin
 *
 */
@RestController
@RequestMapping("state-pattern")
public class StatePatternController {

	@GetMapping()
	public String getChange() {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());

		return "Run state-pattern .....";
	}
}
