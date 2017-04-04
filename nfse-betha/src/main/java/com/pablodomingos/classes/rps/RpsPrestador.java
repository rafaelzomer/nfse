package com.pablodomingos.classes.rps;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CNPJ;

import com.pablodomingos.classes.rps.builders.PrestadorBuilder;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class RpsPrestador extends AbstractRPS {

  @XStreamAlias("CpfCnpj")
  @NotNull
  private RpsCpfCnpj cnpj;

  @XStreamAlias("InscricaoMunicipal")
  @Size(min = 1, max = 15)
  private String inscricaoMunicipal;

  public RpsPrestador(PrestadorBuilder builder) {
    this.cnpj = new RpsCpfCnpj(builder.getCpf(), builder.getCnpj());
    this.inscricaoMunicipal = builder.getInscricaoMunicipal();
  }

  public RpsCpfCnpj getCnpj() {
    return cnpj;
  }

  public String getInscricaoMunicipal() {
    return inscricaoMunicipal;
  }

}