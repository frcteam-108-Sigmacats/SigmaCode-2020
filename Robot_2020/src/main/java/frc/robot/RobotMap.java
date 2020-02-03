package frc.robot;

public class RobotMap
{
	// Robot Stat Values
	public static final double ROBOT_TIME_STEP = 0.02; // 20ms
	public static final double ROBOT_MAX_VELOCITY = 3.2624; // meters per second
	public static final double ROBOT_MAX_ACCELERATION = 0.2;
	public static final double ROBOT_MAX_JERK = 0.5;
	public static final int ROBOT_WHEEL_DIAMETER = 2;

	// Drivetrain ID Values
	public static final int DRIVETRAIN_LEFT1 = 4;
	public static final int DRIVETRAIN_LEFT2 = 5;
	public static final int DRIVETRAIN_LEFT3 = 6;
	public static final int DRIVETRAIN_RIGHT1 = 1;
	public static final int DRIVETRAIN_RIGHT2 = 2;
	public static final int DRIVETRAIN_RIGHT3 = 3;

	// BallMech ID Values
	public static final int BALLMECH_INTAKE = 9;

	//climbMech ID Values
	public static final int CLIMBMECH_MOTOR_LEFT = 2;
	public static final int CLIMBMECH_MOTOR_RIGHT = 1;

	// TestMech Constants
	public static final int TESTMECH_TEST_MOTOR = 55;

	// Vision System Constants
	public static final double HATCH_VISION_TURN_PGAIN = -0.008;
	public static final double HATCH_VISION_DISTANCE_PGAIN = 0.3;
	public static final double HATCH_VISION_MIN_AIM_COMMAND = 0.0;
	public static final double HATCH_VISION_DESIRED_TARGET_AREA = 4.0;	


	public static final int kPIDLoopIdx = 0;
	public static final double kF = 0.051;
	public static final double kP = 0.127;
	public static final double kI = 0.001;
	public static final double kD = 0.1;
	public static final int kTimeoutMs = 0;

	// ENUMS
	public enum ArmPosition 
	{
		STARTING, LOADING_FLOOR, LOADING_WALL, SCORING, CLIMBING;
	}
}