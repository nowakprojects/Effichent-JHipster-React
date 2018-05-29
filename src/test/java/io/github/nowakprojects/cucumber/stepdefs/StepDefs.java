package io.github.nowakprojects.cucumber.stepdefs;

import io.github.nowakprojects.EffichentApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = EffichentApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
