/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbUtils;

/**
 *
 * @author OM NAIK
 */

import java.sql.SQLException;
import java.sql.ResultSetMetaData;

public class DummySimplestPlusMetaData extends DummySimplest
{
    public ResultSetMetaData getMetaData() throws SQLException {
        return (ResultSetMetaData)new DummySimplestPlusMetaData.DummySimplestMetaData(this, (DummySimplestPlusMetaData.DummySimplestMetaData)null);
    }
}