package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.subsystems.ColorWheel;

public class IO
{
    public static XboxController mainController = new XboxController(0);
    public static XboxController operatorController = new XboxController(1);

    // Main Controller Variables
    public static boolean m_buttonA, m_buttonB, m_buttonX, m_buttonXRaw, m_buttonY, m_leftBumper, m_leftBumperReleased, m_rightBumper, m_leftStick, m_rightStick, o_buttonBReleased;
    public static double m_leftTrigger, m_rightTrigger, m_leftAnalogX, m_rightAnalogX, m_leftAnalogY, m_rightAnalogY;
    public static boolean o_buttonA, o_buttonB, o_buttonX, o_buttonXReleased, o_buttonY, o_leftBumper, o_rightBumper, o_leftStick, o_rightStick;
    public static double o_leftTrigger, o_rightTrigger, o_leftAnalogX, o_rightAnalogX, o_leftAnalogY, o_rightAnalogY;

    public static void UpdateControllers()
    {
        m_buttonA = mainController.getRawButton(1);
        m_buttonB = mainController.getRawButton(2);
        m_buttonX = mainController.getRawButton(3);
        m_buttonXRaw = mainController.getRawButton(3);
        m_buttonY = mainController.getRawButtonPressed(4);
        m_leftBumper = mainController.getRawButton(5);
        m_leftBumperReleased = mainController.getRawButtonReleased(5);
        m_rightBumper = mainController.getRawButton(6);
        m_leftStick = mainController.getRawButton(9);
        m_rightStick = mainController.getRawButton(10);
        m_leftTrigger = mainController.getRawAxis(2);
        m_rightTrigger = mainController.getRawAxis(3);
        m_leftAnalogX = mainController.getRawAxis(0);
        m_rightAnalogX = mainController.getRawAxis(4);
        m_leftAnalogY = mainController.getRawAxis(1);
        m_rightAnalogY = mainController.getRawAxis(5);
    }

    public static void ProcessControllers()
    {
        Robot.wheelOfFortune.ruvib();

        if(m_buttonB)
        {
            Robot.ballMech.shooterMotor1.set(-0.8);
            Robot.ballMech.shooterMotor2.set(-0.8);

        }
        else
        {
            Robot.ballMech.shooterMotor1.set(0);
            Robot.ballMech.shooterMotor2.set(0);
        }

        if(m_buttonX)
        {
            Robot.ballMech.intake(0.8);
        }
        else
        {
            Robot.ballMech.stopIntake();
        }
    }
}