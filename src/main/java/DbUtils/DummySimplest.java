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
import java.sql.SQLWarning;
import java.net.URL;
import java.sql.Timestamp;
import java.sql.Time;
import java.sql.Statement;
import java.sql.Ref;
import java.util.Map;
import java.sql.ResultSetMetaData;
import java.util.Calendar;
import java.sql.Date;
import java.sql.Clob;
import java.io.Reader;
import java.sql.Blob;
import java.math.BigDecimal;
import java.io.InputStream;
import java.sql.Array;
import java.sql.NClob;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLXML;

public class DummySimplest implements ResultSet
{
    private boolean empty;
    private static String VALUE;
    
    static {
        DummySimplest.VALUE = "OneAndOnlyValue";
    }
    
    public boolean absolute(final int row) throws SQLException {
        return false;
    }
    
    public void afterLast() throws SQLException {
    }
    
    public void beforeFirst() throws SQLException {
    }
    
    public void cancelRowUpdates() throws SQLException {
    }
    
    public void clearWarnings() throws SQLException {
    }
    
    public void close() throws SQLException {
    }
    
    public void deleteRow() throws SQLException {
    }
    
    public int findColumn(final String columnName) throws SQLException {
        return 0;
    }
    
    public boolean first() throws SQLException {
        return false;
    }
    
    public Array getArray(final int i) throws SQLException {
        return null;
    }
    
    public Array getArray(final String colName) throws SQLException {
        return null;
    }
    
    public InputStream getAsciiStream(final int columnIndex) throws SQLException {
        return null;
    }
    
    public InputStream getAsciiStream(final String columnName) throws SQLException {
        return null;
    }
    
    public BigDecimal getBigDecimal(final int columnIndex) throws SQLException {
        return null;
    }
    
    public BigDecimal getBigDecimal(final String columnName) throws SQLException {
        return null;
    }
    
    public BigDecimal getBigDecimal(final int columnIndex, final int scale) throws SQLException {
        return null;
    }
    
    public BigDecimal getBigDecimal(final String columnName, final int scale) throws SQLException {
        return null;
    }
    
    public InputStream getBinaryStream(final int columnIndex) throws SQLException {
        return null;
    }
    
    public InputStream getBinaryStream(final String columnName) throws SQLException {
        return null;
    }
    
    public Blob getBlob(final int i) throws SQLException {
        return null;
    }
    
    public Blob getBlob(final String colName) throws SQLException {
        return null;
    }
    
    public boolean getBoolean(final int columnIndex) throws SQLException {
        return false;
    }
    
    public boolean getBoolean(final String columnName) throws SQLException {
        return false;
    }
    
    public byte getByte(final int columnIndex) throws SQLException {
        return 0;
    }
    
    public byte getByte(final String columnName) throws SQLException {
        return 0;
    }
    
    public byte[] getBytes(final int columnIndex) throws SQLException {
        return null;
    }
    
    public byte[] getBytes(final String columnName) throws SQLException {
        return null;
    }
    
    public Reader getCharacterStream(final int columnIndex) throws SQLException {
        return null;
    }
    
    public Reader getCharacterStream(final String columnName) throws SQLException {
        return null;
    }
    
    public Clob getClob(final int i) throws SQLException {
        return null;
    }
    
    public Clob getClob(final String colName) throws SQLException {
        return null;
    }
    
    public int getConcurrency() throws SQLException {
        return 0;
    }
    
    public String getCursorName() throws SQLException {
        return null;
    }
    
    public Date getDate(final int columnIndex) throws SQLException {
        return null;
    }
    
    public Date getDate(final String columnName) throws SQLException {
        return null;
    }
    
    public Date getDate(final int columnIndex, final Calendar cal) throws SQLException {
        return null;
    }
    
    public Date getDate(final String columnName, final Calendar cal) throws SQLException {
        return null;
    }
    
    public double getDouble(final int columnIndex) throws SQLException {
        return 0.0;
    }
    
    public double getDouble(final String columnName) throws SQLException {
        return 0.0;
    }
    
    public int getFetchDirection() throws SQLException {
        return 0;
    }
    
    public int getFetchSize() throws SQLException {
        return 0;
    }
    
    public float getFloat(final int columnIndex) throws SQLException {
        return 0.0f;
    }
    
    public float getFloat(final String columnName) throws SQLException {
        return 0.0f;
    }
    
    public int getInt(final int columnIndex) throws SQLException {
        return 0;
    }
    
    public int getInt(final String columnName) throws SQLException {
        return 0;
    }
    
    public long getLong(final int columnIndex) throws SQLException {
        return 0L;
    }
    
    public long getLong(final String columnName) throws SQLException {
        return 0L;
    }
    
    public ResultSetMetaData getMetaData() throws SQLException {
        return null;
    }
    
    public Object getObject(final int columnIndex) throws SQLException {
        return DummySimplest.VALUE;
    }
    
    public Object getObject(final String columnName) throws SQLException {
        return null;
    }
    
    public Object getObject(final int arg0, final Map<String, Class<?>> arg1) throws SQLException {
        return null;
    }
    
    public Object getObject(final String arg0, final Map<String, Class<?>> arg1) throws SQLException {
        return null;
    }
    
    public Ref getRef(final int i) throws SQLException {
        return null;
    }
    
    public Ref getRef(final String colName) throws SQLException {
        return null;
    }
    
    public int getRow() throws SQLException {
        return 0;
    }
    
    public short getShort(final int columnIndex) throws SQLException {
        return 0;
    }
    
    public short getShort(final String columnName) throws SQLException {
        return 0;
    }
    
    public Statement getStatement() throws SQLException {
        return null;
    }
    
    public String getString(final int columnIndex) throws SQLException {
        if (columnIndex != 1) {
            throw new SQLException("Index to getString can only be 1 in this ResultSet");
        }
        return DummySimplest.VALUE;
    }
    
    public String getString(final String columnName) throws SQLException {
        return "OneAndOnlyValue";
    }
    
    public Time getTime(final int columnIndex) throws SQLException {
        return null;
    }
    
    public Time getTime(final String columnName) throws SQLException {
        return null;
    }
    
    public Time getTime(final int columnIndex, final Calendar cal) throws SQLException {
        return null;
    }
    
    public Time getTime(final String columnName, final Calendar cal) throws SQLException {
        return null;
    }
    
    public Timestamp getTimestamp(final int columnIndex) throws SQLException {
        return null;
    }
    
    public Timestamp getTimestamp(final String columnName) throws SQLException {
        return null;
    }
    
    public Timestamp getTimestamp(final int columnIndex, final Calendar cal) throws SQLException {
        return null;
    }
    
    public Timestamp getTimestamp(final String columnName, final Calendar cal) throws SQLException {
        return null;
    }
    
    public int getType() throws SQLException {
        return 0;
    }
    
    public URL getURL(final int columnIndex) throws SQLException {
        return null;
    }
    
    public URL getURL(final String columnName) throws SQLException {
        return null;
    }
    
    public InputStream getUnicodeStream(final int columnIndex) throws SQLException {
        return null;
    }
    
    public InputStream getUnicodeStream(final String columnName) throws SQLException {
        return null;
    }
    
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }
    
    public void insertRow() throws SQLException {
    }
    
    public boolean isAfterLast() throws SQLException {
        return false;
    }
    
    public boolean isBeforeFirst() throws SQLException {
        return false;
    }
    
    public boolean isFirst() throws SQLException {
        return false;
    }
    
    public boolean isLast() throws SQLException {
        return false;
    }
    
    public boolean last() throws SQLException {
        return false;
    }
    
    public void moveToCurrentRow() throws SQLException {
    }
    
    public void moveToInsertRow() throws SQLException {
    }
    
    public boolean next() throws SQLException {
        return !this.empty && (this.empty = true);
    }
    
    public boolean previous() throws SQLException {
        return false;
    }
    
    public void refreshRow() throws SQLException {
    }
    
    public boolean relative(final int rows) throws SQLException {
        return false;
    }
    
    public boolean rowDeleted() throws SQLException {
        return false;
    }
    
    public boolean rowInserted() throws SQLException {
        return false;
    }
    
    public boolean rowUpdated() throws SQLException {
        return false;
    }
    
    public void setFetchDirection(final int direction) throws SQLException {
    }
    
    public void setFetchSize(final int rows) throws SQLException {
    }
    
    public void updateArray(final int columnIndex, final Array x) throws SQLException {
    }
    
    public void updateArray(final String columnName, final Array x) throws SQLException {
    }
    
    public void updateAsciiStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
    }
    
    public void updateAsciiStream(final String columnName, final InputStream x, final int length) throws SQLException {
    }
    
    public void updateBigDecimal(final int columnIndex, final BigDecimal x) throws SQLException {
    }
    
    public void updateBigDecimal(final String columnName, final BigDecimal x) throws SQLException {
    }
    
    public void updateBinaryStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
    }
    
    public void updateBinaryStream(final String columnName, final InputStream x, final int length) throws SQLException {
    }
    
    public void updateBlob(final int columnIndex, final Blob x) throws SQLException {
    }
    
    public void updateBlob(final String columnName, final Blob x) throws SQLException {
    }
    
    public void updateBoolean(final int columnIndex, final boolean x) throws SQLException {
    }
    
    public void updateBoolean(final String columnName, final boolean x) throws SQLException {
    }
    
    public void updateByte(final int columnIndex, final byte x) throws SQLException {
    }
    
    public void updateByte(final String columnName, final byte x) throws SQLException {
    }
    
    public void updateBytes(final int columnIndex, final byte[] x) throws SQLException {
    }
    
    public void updateBytes(final String columnName, final byte[] x) throws SQLException {
    }
    
    public void updateCharacterStream(final int columnIndex, final Reader x, final int length) throws SQLException {
    }
    
    public void updateCharacterStream(final String columnName, final Reader reader, final int length) throws SQLException {
    }
    
    public void updateClob(final int columnIndex, final Clob x) throws SQLException {
    }
    
    public void updateClob(final String columnName, final Clob x) throws SQLException {
    }
    
    public void updateDate(final int columnIndex, final Date x) throws SQLException {
    }
    
    public void updateDate(final String columnName, final Date x) throws SQLException {
    }
    
    public void updateDouble(final int columnIndex, final double x) throws SQLException {
    }
    
    public void updateDouble(final String columnName, final double x) throws SQLException {
    }
    
    public void updateFloat(final int columnIndex, final float x) throws SQLException {
    }
    
    public void updateFloat(final String columnName, final float x) throws SQLException {
    }
    
    public void updateInt(final int columnIndex, final int x) throws SQLException {
    }
    
    public void updateInt(final String columnName, final int x) throws SQLException {
    }
    
    public void updateLong(final int columnIndex, final long x) throws SQLException {
    }
    
    public void updateLong(final String columnName, final long x) throws SQLException {
    }
    
    public void updateNull(final int columnIndex) throws SQLException {
    }
    
    public void updateNull(final String columnName) throws SQLException {
    }
    
    public void updateObject(final int columnIndex, final Object x) throws SQLException {
    }
    
    public void updateObject(final String columnName, final Object x) throws SQLException {
    }
    
    public void updateObject(final int columnIndex, final Object x, final int scale) throws SQLException {
    }
    
    public void updateObject(final String columnName, final Object x, final int scale) throws SQLException {
    }
    
    public void updateRef(final int columnIndex, final Ref x) throws SQLException {
    }
    
    public void updateRef(final String columnName, final Ref x) throws SQLException {
    }
    
    public void updateRow() throws SQLException {
    }
    
    public void updateShort(final int columnIndex, final short x) throws SQLException {
    }
    
    public void updateShort(final String columnName, final short x) throws SQLException {
    }
    
    public void updateString(final int columnIndex, final String x) throws SQLException {
    }
    
    public void updateString(final String columnName, final String x) throws SQLException {
    }
    
    public void updateTime(final int columnIndex, final Time x) throws SQLException {
    }
    
    public void updateTime(final String columnName, final Time x) throws SQLException {
    }
    
    public void updateTimestamp(final int columnIndex, final Timestamp x) throws SQLException {
    }
    
    public void updateTimestamp(final String columnName, final Timestamp x) throws SQLException {
    }
    
    public boolean wasNull() throws SQLException {
        return false;
    }

    @Override
    public RowId getRowId(int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RowId getRowId(String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateRowId(int columnIndex, RowId x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateRowId(String columnLabel, RowId x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHoldability() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isClosed() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNString(int columnIndex, String nString) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNString(String columnLabel, String nString) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNClob(String columnLabel, NClob nClob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NClob getNClob(int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NClob getNClob(String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SQLXML getSQLXML(int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SQLXML getSQLXML(String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNString(int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNString(String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reader getNCharacterStream(int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reader getNCharacterStream(String columnLabel) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateClob(int columnIndex, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateClob(String columnLabel, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNClob(int columnIndex, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNClob(String columnLabel, Reader reader) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
