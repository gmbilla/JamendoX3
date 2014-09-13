/*
 * Copyright (c) 2014 Santo Pfingsten
 *
 * This software is provided 'as-is', without any express or implied warranty.
 * In no event will the authors be held liable for any damages arising from the use of this software.
 *
 * Permission is granted to anyone to use this software for any purpose, including commercial
 * applications, and to alter it and redistribute it freely, subject to the following restrictions:
 *
 * 1. The origin of this software must not be misrepresented; you must not claim that you wrote the
 *    original software. If you use this software in a product, an acknowledgment in the product
 *    documentation would be appreciated but is not required.
 *
 * 2. Altered source versions must be plainly marked as such, and must not be misrepresented as being
 *    the original software.
 *
 * 3. This notice may not be removed or altered from any source distribution.
 */

package info.lusito.jamendo.api.results.radio;

import info.lusito.jamendo.api.enums.RadioType;

public class RadioStream {
    public Integer id;
    public String name;
    public String dispname;
    public RadioType type;
    public String image;
    public String stream;
    /**
     * How many ms until the next track starts
     */
    public Integer callmeback;
    public PlayingNow playingnow;

    public static class PlayingNow {
        public Integer track_id;
        public Integer artist_id;
        public Integer album_id;
        public String album_name;
        public String track_name;
        public String track_image;
        public String artist_name;
    }
}
