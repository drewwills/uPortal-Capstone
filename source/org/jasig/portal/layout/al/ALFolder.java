/* Copyright 2002 The JA-SIG Collaborative.  All rights reserved.
*  See license distributed with this file and
*  available online at http://www.uportal.org/license.html
*/

package org.jasig.portal.layout.al;

import org.jasig.portal.layout.al.common.node.IFolderDescription;
import org.jasig.portal.layout.al.common.node.NodeType;


/**
 * UserLayoutFolder summary sentence goes here.
 * <p>
 * Company: Instructional Media &amp; Magic
 *
 * @author Michael Ivanov mailto:mvi@immagic.com
 * @version $Revision$
 */


public class ALFolder extends ALNode {

    protected String firstChildNodeId;

    public ALFolder ( IALFolderDescription nd ) {
        super (nd);
    }

    /**
     * Gets the node type
     * @return a node type
     */
     public NodeType getNodeType() {
       return NodeType.FOLDER;
     }


    /**
     * Sets the first child node ID
     */
    public void setFirstChildNodeId( String firstChildNodeId ) {
        this.firstChildNodeId = firstChildNodeId;
    }

    /**
     * Gets the first child node ID
     * @return a first child node ID
     */
    public String getFirstChildNodeId() {
        return firstChildNodeId;
    }


    public static ALFolder createLostFolder() {
    	ALFolderDescription folderDesc = new ALFolderDescription();
        ALFolder lostFolder = new ALFolder(folderDesc);
        lostFolder.setId(IALFolderDescription.LOST_FOLDER_ID);
        folderDesc.setHidden(true);
        folderDesc.setImmutable(false);
        folderDesc.setUnremovable(true);
        folderDesc.setFolderType(IFolderDescription.REGULAR_TYPE);
        lostFolder.setNodeDescription(folderDesc);
        // TODO: how do we assign a reference to a root node ?
        // lostFolder.setParentNodeId(IALFolderDescription.ROOT_FOLDER_ID);
        return lostFolder;
    }

    public static ALFolder createRootFolder() {
    	ALFolderDescription folderDesc = new ALFolderDescription();
        ALFolder rootFolder = new ALFolder(folderDesc);
        rootFolder.setId(IALFolderDescription.ROOT_FOLDER_ID);
        folderDesc.setHidden(false);
        folderDesc.setImmutable(false);
        folderDesc.setUnremovable(true);
        folderDesc.setName("Root folder");
        folderDesc.setFolderType(IFolderDescription.REGULAR_TYPE);
        rootFolder.setNodeDescription(folderDesc);
        return rootFolder;
    }

}
