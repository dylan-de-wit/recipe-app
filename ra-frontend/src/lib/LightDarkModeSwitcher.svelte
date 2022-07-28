<script lang="ts">
    import Icon from './Icon.svelte';
    import sun from '$lib/assets/sun.png';
    import moon from '$lib/assets/moon.png';
    import { onMount } from 'svelte';

    let selectedTheme;
    onMount(() => {
        const currentTheme = document.body.getAttribute('data-theme');
        selectedTheme = currentTheme === 'dark' ? 'dark' : 'light';
    });

    function switchMode(): void {
        const currentTheme = document.body.getAttribute('data-theme');
        selectedTheme = currentTheme === 'dark' ? 'light' : 'dark';
        document.body.setAttribute('data-theme', selectedTheme);
    }
</script>

<div class="light-dark-icon">
    <Icon icon="{selectedTheme === 'dark' ? sun : moon}" size="s" on:click={switchMode}></Icon>
</div>

<style lang="scss">
  .light-dark-icon {
    cursor: pointer;
  }
</style>