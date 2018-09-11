package edu.cornell.ncrn.ced2ar.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.cornell.ncrn.ced2ar.model.Field;
import edu.cornell.ncrn.ced2ar.model.FieldIndice;
import edu.cornell.ncrn.ced2ar.model.FieldInst;
import edu.cornell.ncrn.ced2ar.model.Mapping;
import edu.cornell.ncrn.ced2ar.model.Profile;
import edu.cornell.ncrn.ced2ar.model.ProfileField;
import edu.cornell.ncrn.ced2ar.model.RawDoc;
import edu.cornell.ncrn.ced2ar.model.dao.FieldDao;
import edu.cornell.ncrn.ced2ar.model.dao.FieldIndiceDao;
import edu.cornell.ncrn.ced2ar.model.dao.FieldInstDao;
import edu.cornell.ncrn.ced2ar.model.dao.MappingDao;
import edu.cornell.ncrn.ced2ar.model.dao.ProfileDao;
import edu.cornell.ncrn.ced2ar.model.dao.ProfileFieldDao;
import edu.cornell.ncrn.ced2ar.model.dao.RawDocDao;
import edu.cornell.ncrn.ced2ar.model.dao.SchemaDao;
import edu.cornell.ncrn.ced2ar.model.Schema;
import edu.cornell.ncrn.ced2ar.model.SchemaPK;
import edu.cornell.ncrn.ced2ar.util.XMLHandle;
import org.springframework.stereotype.Service;

/**
 * Service class providing reusable functions for editing codebooks
 * 
 * @author kylebrumsted
 *
 */
@Service
public class CodebookEditService {
	
	@Autowired
	RawDocDao rawDocDao;
	@Autowired
	ProfileDao profileDao;
	@Autowired
	FieldDao fieldDao;
	@Autowired
	ProfileFieldDao profileFieldDao;
	@Autowired
	MappingDao mappingDao;
	@Autowired
	SchemaDao schemaDao;
	@Autowired
	FieldInstDao fieldInstDao;
	@Autowired
	FieldIndiceDao fieldIndiceDao;
	
	
	
	/**
	 * Adds a new field to a codebook titlepage. Online fields that are valid according to the schema
	 * will be allowed as additions.
	 * 
	 * Triggers SQL edits and XML edits.
	 * 
	 * @param handle : codebook to edit
	 * @param fieldId : new field to add
	 * @param newValue : value for the field
	 * @return : whether the operation was successful or not.
	 */
	public boolean addCodebookField(String handle, String fieldId, String newValue)
	{
		
		
		return false;
	}
	
	
	/**
	 * edit an existing field in a codebook (titlepage)
	 * 
	 * calls the edits for all necessary SQL tables as well as the XML rawDoc
	 * 
	 * @param handle : codebook to edit
	 * @param fieldId : field to edit
	 * @param newValue : new value for field
	 * @return whether the edit was successfull
	 */
	public boolean editCodebookField(String handle, String fieldId, String newValue)
	{
		
		
		return false;
	}
	
	/**
	 * Deletes a field in a codebook titlepage
	 * 
	 * @param handle : codebook to edit
	 * @param fieldId : field to delete
	 * @return : whether or not the operation was successful
	 */
	public boolean deleteCodebookField(String handle, String fieldId)
	{
		
		
		return false;
	}
	
	
	/**
	 * Adds a new variable to a codebook. 
	 * 
	 * Edits SQL and XML
	 * 
	 * @param handle : codebook to edit
	 * @param varname : Name of new variable
	 * @return : whether the operation was successful or not
	 */
	public boolean addVariable(String handle, String varname)
	{
		
		/*
		 *This must update fieldInst and also fieldIndices. 
		 *FieldIndices will probably be complicated.
		 */
		
		return false;
	}
	
	public boolean deleteVariable(String handle, String varname)
	{
		
		
		return false;
	}
	
	
	public boolean addVariableField(String handle, String varname, String fieldId, String newValue)
	{
		
		return false;
	}
	
	
	public boolean editVariableField(String handle, String varname, String fieldId, String newValue)
	{
		
		
		return false;
	}
	
	public boolean deleteVariableField(String handle, String varname, String fieldId)
	{
		
		return false;
	}
	
	

}
