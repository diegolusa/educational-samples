/*
 * The MIT License
 *
 * Copyright 2018 diego.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package br.edu.ifrs.prog.projeto.base.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public abstract class GenericDao<T,K> {
    private Connection conn;
    
    public GenericDao(Connection conn){
        this.conn = conn;
    }
   

    protected Connection getConnection(){
        return this.conn;
    }
    
    public abstract K addRow(T object) throws SQLException;
    public abstract void removeRow(T object) throws SQLException;
    public abstract void updateRow(T object) throws SQLException;
    public abstract List<T> getAllRows(RowMapper<T> mapper) throws SQLException;
    public abstract T getRowById(K key,RowMapper<T> mapper) throws SQLException;
}
