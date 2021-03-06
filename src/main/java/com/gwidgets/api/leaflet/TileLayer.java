package com.gwidgets.api.leaflet;

/**
 *  Copyright 2016 G-Widgets
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import com.gwidgets.api.leaflet.elemental.Function;
import com.gwidgets.api.leaflet.elemental.HTMLElement;
import com.gwidgets.api.leaflet.options.TileLayerOptions;
import com.gwidgets.api.leaflet.options.TileLayerWMSOptions;

/**
 * Used to load and display tile layers on the map,
 * @author <a href="mailto:zakaria.amine88@gmail.com">Zakaria Amine</a>
 */
@JsType(isNative = true)
public class TileLayer implements ILayer{


	/**
	 * Adds the layer to the map.
	 *
	 * @param map the map
	 * @return the  L class
	 */
	@JsMethod
	public native L addTo(Map map);

	/**
	 * Brings the tile layer to the top of all tile layers.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L bringToFront();

	/**
	 * Brings the tile layer to the bottom of all tile layers.
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L bringToBack();

	/**
	 * Changes the opacity of the tile layer.
	 *
	 * @param opacity the opacity
	 * @return the L class
	 */
	@JsMethod
	public native L setOpacity(Number opacity);

	/**
	 * Sets the zIndex of the tile layer.
	 *
	 * @param zIndex the z index
	 * @return the L class
	 */
	@JsMethod
	public native L setZIndex(Number zIndex);

	/**
	 * Causes the layer to clear all the tiles and request them again
	 *
	 * @return the L class
	 */
	@JsMethod
	public native L redraw();

	/**
	 * Updates the layer's URL template and redraws it.
	 *
	 * @param urlTemplate the url template
	 * @return the L class
	 */
	@JsMethod
	public native L setUrl(String urlTemplate);

	/**
	 * Returns the HTML element that contains the tiles for this layer.
	 *
	 * @return the container
	 */
	@JsMethod
	public native HTMLElement getContainer();

	//Events

	// events

	/**
	 * Clear all event listeners.
	 *
	 * @return the L class
	 */
	@JsMethod
	public static native L clearAllEventListeners();

	/**
	 * Adds a set of type/listener pairs
	 *
	 * @param type the type
	 * @param fn the callback function
	 * @return the L class
	 */
	@JsMethod
	public static native L on(String type, Function fn);

	/**
	 * Once.
	 *
	 * @param type the type
	 * @param fn the callback function
	 * @return the L class
	 */
	@JsMethod
	public static native L once(String type, Function fn);

	/**
	 *  the listener will only get fired once and then removed.
	 *
	 * @param type the type
	 * @param fn the callback function
	 * @return the L class
	 */
	@JsMethod
	public static native L off(String type, Function fn);

	/**
	 * Fires an event of the specified type. You can optionally provide an data object — the first argument of the listener function will contain its properties.
	 *
	 * @param type the type
	 * @return the L class
	 */
	@JsMethod
	public static native L fire(String type);

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.ILayer#onAdd(com.gwidgets.api.leaflet.Map)
	 */
	@Override
	@JsMethod
	public native void onAdd(Map map);

	/* (non-Javadoc)
	 * @see com.gwidgets.api.leaflet.ILayer#onRemove(com.gwidgets.api.leaflet.Map)
	 */
	@Override
	@JsMethod
	public native void onRemove(Map map);

}

