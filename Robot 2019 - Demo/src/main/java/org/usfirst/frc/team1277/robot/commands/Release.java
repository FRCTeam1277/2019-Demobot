package org.usfirst.frc.team1277.robot.commands;

import org.usfirst.frc.team1277.robot.RobotMap;
import org.usfirst.frc.team1277.robot.subsystems.Hatch;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Release extends Command {
	public static boolean released = false;

	public Release() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		released = false;
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Hatch.release();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return RobotMap.releaseLimit.get();
	}

	// Called once after isFinished returns true
	protected void end() {
		released = true;
		Hatch.stopRelease();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Hatch.stopRelease();
	}
}
