package com.example.Meteora.logisticsCoordinator.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.logisticsCoordinator.values.CoordinatorName;
import com.example.Meteora.logisticsCoordinator.values.LogisticsCoordinatorID;

public class AddCoordinatorName extends Command {

    private final LogisticsCoordinatorID logisticsCoordinatorID;
    private final CoordinatorName coordinatorName;

    public AddCoordinatorName(LogisticsCoordinatorID logisticsCoordinatorID, CoordinatorName coordinatorName) {
        this.logisticsCoordinatorID = logisticsCoordinatorID;
        this.coordinatorName = coordinatorName;
    }

    public LogisticsCoordinatorID getLogisticsCoordinatorID() {
        return logisticsCoordinatorID;
    }

    public CoordinatorName getCoordinatorName() {
        return coordinatorName;
    }
}
