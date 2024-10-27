# COMP1010-Assignment

# Music Library Management Project Overview

---

## Project Overview

The **Music Library Management** application is a Java-based program that allows users to manage their music playlists effectively. The application supports three distinct playlists: one for solo artist songs, one for band songs and one for songs by a specific artist. Users can play, pause, shuffle, and navigate through the playlists, enhancing their listening experience.

---

## Functionality

The **Music Library Management** application offers the following features for users:

### 1. Playlist Management

- **Playlist Creation:**
  - Users can manage up to **Three playlists**.
  - Each playlist can contain multiple songs.

### 2. Playlist Types

- **Types of Playlists:**
  - **Solo Artist Playlist:** Contains songs from solo artists.
  - **Band Playlist:** Contains songs from bands.
  - **Artist Playlist:** Contains songs by a specific artist.

### 3. Music Playback Controls

- **Playback Features:**
  - **Play:** Start playing the selected song from the playlist.
  - **Pause:** Pause the current song.
  - **Next:** Skip to the next song in the playlist.
  - **Shuffle:** Randomly rearrange the song order in the playlist.
  - **Previous:** Go back to the last song.

### 4. User Interaction

When a playlist is playing, users will see the current song information along with available controls:

- **Current Song Playing**: Displays the name of the song, for example:  
  `Song playing: Starboy by Daft Punk and The Weeknd`

### 5. Output

- **Output Format:**
  - The application generates a **summary output** of the playlist being played, including:
    - **Playlist Name**
    - **Currently Playing Song**
    - **Playback Status** (Playing, Paused)
    - **Total Songs in Playlist**

---

## Non-Functional Requirements

### 1. Performance and Scalability
- **Efficient Playback:**
  - The application must support multiple playlists and song navigation with minimal latency to ensure smooth user experience.

### 2. Documentation and Usability
- **User Guide:**
  - Provide comprehensive documentation detailing how to use the application features and playback controls effectively.

---

## How to Run the Program

### 1. Start the Application:
   - Run the program using your IDE or command line.

### 2. Select a Playlist:
   - Press `1` for **Solo Artist Playlist**.
   - Press `2` for **Band Playlist**.
   - Press `3` for **Specific Artist Playlist**.

### 3. Music Playback Controls:
   - **Current Song Playing**: Displays the currently playing song.
   - **Press the following buttons for playback control**:
     - `0` to **Pause** the music.
     - `1` for **Previous Song**.
     - `2` for **Next Song**.
     - `3` to **Shuffle** the playlist.
     - `4` to **Exit** the application.

### 4. Invalid Input:
   - If you enter a number outside the valid range (0-4), the application will display **"Invalid input. Try again."**.


## Technical Specifications

### 1. Programming Language and Environment

- **Language:**
  - Developed using **Java SE 11 or higher**.

### 2. Data Structures

- **Playlist Representation:**
  - Each playlist is represented as an **object** containing a list of songs.
  - Each song is an object with attributes such as title, artist, and duration.

### 3. Algorithms and Logic

- **Playback Logic:**
  - Implement control functions for play, pause, next, and shuffle operations.
  - Maintain the current state of the playlist (e.g., currently playing song).

### 4. Testing and Quality Assurance

- **Unit Testing:**
  - Conduct tests for individual playback controls and ensure proper functionality of:
    - **Playlists:** Verify that playlists can be created, modified, and navigated correctly.
    - **Albums:** Ensure album information is accurately displayed and associated with the correct songs.
    - **Artists:** Test that artist details are correctly linked to their songs and that functionalities like adding and removing songs work as expected.

---

## Sample Output

### Sample Playlist Structure:

1. **Solo Artist Playlist:**
   - **Songs:**
     - "Blinding Lights" by The Weeknd
     - "Say" by Keshi
2. **Band Playlist:**
   - **Songs:**
     - "18" by One Direction
     - "You & I" by Oasis
3. **Specefic Artist Playlist:**
   - **Songs:**
     - "After Hours" by The Weeknd
     - "Die for You" by The Weeknd

---
## UML Diagrams

![2394fa6f](https://github.com/user-attachments/assets/cb022346-8540-4de6-a313-6c9c5cb71807)

---

## Conclusion

The **Music Library Management** application effectively combines functionality and user experience, allowing users to engage with their music in a structured yet enjoyable way. With four distinct playlists tailored to various music genres and artists, the application enhances the listening experience through essential playback controls. By enabling features such as play, pause, next, and shuffle, users can effortlessly navigate their music collection. Additionally, the static nature of the playlists ensures a consistent and reliable experience, allowing users to focus on enjoying their favorite tracks without the distraction of modifications. Overall, this project not only serves as a practical application of Java programming concepts but also provides an engaging platform for music enthusiasts to explore and enjoy their playlists.

---

## Team Contributions

### Tasmia Tunjomony (48364304)
- Developed the **Song Class**, managing song attributes such as title, artist, album, and duration.
- Implemented methods for displaying song details and controlling playback.

### Gayathri Binu Sreeja (48409510)
- Created the **Playlist Class**, responsible for managing different playlists and handling song additions and removals.
- Designed the logic for navigating through playlists and managing playback order.

### Joy Xu (48501212)
- Designed the **Artist Class**, encapsulating artist information and maintaining a list of songs associated with each artist.
- Assisted in ensuring seamless integration of the Artist class with the Song and Playlist classes.

### Collaborative Work
- Collaboratively focused on the **Main.java** file to integrate all components and ensure smooth interaction between the classes.
- Identified the need for the **Album Class** to manage album-related functionalities and collectively worked on its implementation.
- Conducted **JUnit Testing** together to ensure the reliability and functionality of each class and its methods, verifying that all components work as intended.
