@author - rv
 *  @version  1.00 01/10/2015
 *  
 *  team #   -- 3944
 *  
 * COMMENTS:
 *
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 *       
 *
 * REVISIONS:
 * 
 *  Deployment - 1.00 - jd  - Initial Deployment
 *
 */

// Imports go here
package org.usfirst.frc.team3944.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import edu.wpi.first.wpilibj.livewindow.*;
import edu.wpi.first.wpilibj.Talon; 
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
 
public class Robot extends IterativeRobot {
	/* Autonomous Variable Section 
	 * 
	 * Lifter Variables 
	 * Positive is down, Negative is up
	 */
	 private double autoInitialDownSpeed 	=  0.8;
	 private double autoInitialUpSpeed 		= -0.3;
	 private double autoSpeedStop			=  0;
	 
	
