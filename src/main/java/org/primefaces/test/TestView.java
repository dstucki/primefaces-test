package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {

    private String string;

    @PostConstruct
    public void init() {
        string = null;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
