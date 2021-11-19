package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Valve extends SubsystemBase{
    
    WPI_TalonSRX tal = new WPI_TalonSRX(Constants.VALVE_MOTOR_ID);

    public Valve()
    {

    }

    public void open()
    {
        // tal.set()
    }

    public void close()
    {
        
    }
}
