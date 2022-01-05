
package DbUtils;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

class DummySimplestMetaData implements ResultSetMetaData
{

    private final DummyNRowCol this$0;
    private DummySimplestMetaData(final DummyNRowCol this$0) {
        this.this$0 = this$0;
    }
    
    public String getCatalogName(final int column) throws SQLException {
        return null;
    }
    
    public String getColumnClassName(final int column) throws SQLException {
        return "java.lang.String";
    }
    
    public int getColumnCount() throws SQLException {
        return DummyNRowCol.access$0(this.this$0);
    }
    
    public int getColumnDisplaySize(final int column) throws SQLException {
        return 0;
    }
    
    public String getColumnLabel(final int column) throws SQLException {
        return String.format("%s%d", "Column", column);
    }
    
    public String getColumnName(final int column) throws SQLException {
        return String.format("%s%d", "Column", column);
    }
    
    public int getColumnType(final int column) throws SQLException {
        return 12;
    }
    
    public String getColumnTypeName(final int column) throws SQLException {
        return "VARCHAR";
    }
    
    public int getPrecision(final int column) throws SQLException {
        return 0;
    }
    
    public int getScale(final int column) throws SQLException {
        return 0;
    }
    
    public String getSchemaName(final int column) throws SQLException {
        return null;
    }
    
    public String getTableName(final int column) throws SQLException {
        if (column != 1) {
            throw new SQLException("Index can only be 1 for this metadata");
        }
        return "DummyTable";
    }
    
    public boolean isAutoIncrement(final int column) throws SQLException {
        return false;
    }
    
    public boolean isCaseSensitive(final int column) throws SQLException {
        return false;
    }
    
    public boolean isCurrency(final int column) throws SQLException {
        return false;
    }
    
    public boolean isDefinitelyWritable(final int column) throws SQLException {
        return false;
    }
    
    public int isNullable(final int column) throws SQLException {
        return 0;
    }
    
    public boolean isReadOnly(final int column) throws SQLException {
        return false;
    }
    
    public boolean isSearchable(final int column) throws SQLException {
        return false;
    }
    
    public boolean isSigned(final int column) throws SQLException {
        return false;
    }
    
    public boolean isWritable(final int column) throws SQLException {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}