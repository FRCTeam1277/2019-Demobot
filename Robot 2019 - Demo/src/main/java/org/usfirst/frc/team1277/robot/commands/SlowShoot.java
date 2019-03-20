/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1277.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1277.robot.subsystems.Shooter;

/**
 * An example command. You can replace me with your own command.
 */
public class SlowShoot extends Command {
private boolean stop = false;

	public SlowShoot() {
		// Use requires() here to declare subsystem dependencies
		
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {

	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
        Shooter.PUSH_SPEED=0.75;
        stop=true;
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return stop;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
        stop=false;
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		stop=false;
	}
}
