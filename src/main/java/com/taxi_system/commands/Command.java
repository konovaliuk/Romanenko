package com.taxi_system.commands;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Victoria on 02.01.2018.
 */
public interface Command {
    String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}

