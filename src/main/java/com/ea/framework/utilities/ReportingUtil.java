package com.ea.framework.utilities;

import java.sql.Connection;
import java.util.Hashtable;

/**
 * Created by Karthik-PC on 11/23/2016.
 */
public class ReportingUtil {


    public static void CreateTestCycle(Connection connection)
    {

        //Params
        Hashtable table = new Hashtable();
        table.put("AUT", "ExecuteAutoamtionWebApp");
        table.put("ExecutedBy", "Karthik");
        table.put("RequestedBy", "Jacob");
        table.put("BuildNo", "1.0");
        table.put("ApplicationVersion", "1.0");
        table.put("MachineName", "Windows 10");
        table.put("TestType",1);

        DatabaseUtil.ExecuteStoredProc("sp_CreateTestCycleID",table, connection );

    }

}
