package com.app.lti.service;

import java.util.List;
import java.util.Optional;

import com.app.lti.document.MultiplexDocument;

public interface MultiplexService {

	public MultiplexDocument registerMultiplex(MultiplexDocument multidoDocument);

	public Optional<MultiplexDocument> getMultiplexDetail(String multiplexId);

	public List<MultiplexDocument> findAll();

	public void deleteMujltiplexById(String userId);

	public void deleteAll();

	public MultiplexDocument updateMultiplexDetail(String multiplexId, MultiplexDocument multiplexDocument);

}
